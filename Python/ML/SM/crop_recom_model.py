import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score
import joblib

# Load the dataset from the CSV file
crop_data = pd.read_csv('Crop_recommendation.csv')  # Replace with the actual path to your CSV file

# Define feature columns and target column
features = crop_data[['N', 'P', 'K', 'temperature', 'humidity', 'ph', 'rainfall']]
target = crop_data['label']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(features, target, test_size=0.2, random_state=42)

# Initialize and train the Random Forest classifier
model = RandomForestClassifier(n_estimators=100, random_state=42)
model.fit(X_train, y_train)

y_pred = model.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
print(f'Model accuracy: {accuracy * 100:.2f}%')

joblib.dump(model, 'crop_recommendation_model.pkl')