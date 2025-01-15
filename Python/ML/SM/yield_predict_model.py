import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestRegressor
from sklearn.metrics import mean_absolute_error, mean_squared_error, r2_score
import joblib

# Assuming crop_data_new is already defined and includes the 'yield' column
# If not, use the code snippet to create 'yield' data as explained earlier

import pandas as pd

# Load the dataset
crop_data_new = pd.read_csv('Crop_recommendation.csv')

np.random.seed(42)
crop_data_new['yield'] = (
    2 * crop_data_new['N'] + 
    1.5 * crop_data_new['P'] + 
    1.2 * crop_data_new['K'] +
    0.8 * crop_data_new['temperature'] +
    0.5 * crop_data_new['humidity'] +
    2 * crop_data_new['ph'] +
    0.3 * crop_data_new['rainfall'] +
    np.random.normal(0, 10, size=len(crop_data_new))  # Adding some noise
)

# Define feature columns and target column
features = crop_data_new[['N', 'P', 'K', 'temperature', 'humidity', 'ph', 'rainfall']]
target = crop_data_new['yield']

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(features, target, test_size=0.2, random_state=42)

# Initialize and train the Random Forest Regressor
regressor = RandomForestRegressor(n_estimators=100, random_state=42)
regressor.fit(X_train, y_train)

# Test the model
y_pred = regressor.predict(X_test)

# Evaluate the model's performance
mae = mean_absolute_error(y_test, y_pred)
mse = mean_squared_error(y_test, y_pred)
r2 = r2_score(y_test, y_pred)

print(f'Mean Absolute Error: {mae:.2f}')
print(f'Mean Squared Error: {mse:.2f}')
print(f'R-squared: {r2:.2f}')

# Save the trained model
joblib.dump(regressor, 'yield_prediction_model.pkl')
