# import streamlit as st
# import numpy as np
# import joblib

# # Load the trained model
# model = joblib.load('crop_recommendation_model.pkl')

# # Streamlit app interface
# st.title('Smart Farming: Crop Recommendation System')

# # Input fields for soil and environmental conditions
# N = st.number_input('Nitrogen content in soil', min_value=0, max_value=100, value=50)
# P = st.number_input('Phosphorus content in soil', min_value=0, max_value=100, value=50)
# K = st.number_input('Potassium content in soil', min_value=0, max_value=100, value=50)
# temperature = st.number_input('Temperature (°C)', min_value=0.0, max_value=50.0, value=25.0)
# humidity = st.number_input('Humidity (%)', min_value=0.0, max_value=100.0, value=50.0)
# ph = st.number_input('pH level of the soil', min_value=0.0, max_value=14.0, value=7.0)
# rainfall = st.number_input('Rainfall (mm)', min_value=0.0, max_value=500.0, value=100.0)

# # Predict button
# if st.button('Recommend Crop'):
#     # Prepare the input data for prediction
#     input_features = np.array([[N, P, K, temperature, humidity, ph, rainfall]])
#     # Make prediction
#     prediction = model.predict(input_features)
#     st.write(f'Recommended Crop: {prediction[0]}')



import streamlit as st
import numpy as np
import pandas as pd
import joblib

def crop_recommendation():
    st.title('Crop Recommendation System')
    
    # Load the trained model
    model = joblib.load('crop_recommendation_model.pkl')

    # Input fields for soil and environmental conditions
    N = st.number_input('Nitrogen content in soil (kg/ha)', min_value=0, max_value=100, value=50)
    P = st.number_input('Phosphorus content in soil (kg/ha)', min_value=0, max_value=100, value=50)
    K = st.number_input('Potassium content in soil (kg/ha)', min_value=0, max_value=100, value=50)
    temperature = st.number_input('Temperature (°C)', min_value=0.0, max_value=50.0, value=25.0)
    humidity = st.number_input('Humidity (%)', min_value=0.0, max_value=100.0, value=50.0)
    ph = st.number_input('pH level of the soil', min_value=0.0, max_value=14.0, value=7.0)
    rainfall = st.number_input('Rainfall (mm)', min_value=0.0, max_value=500.0, value=100.0)

    # Predict button
    if st.button('Recommend Crop'):
        # Prepare the input data for prediction
        input_features = np.array([[N, P, K, temperature, humidity, ph, rainfall]])
        # Make predictions
        crop_prediction = model.predict(input_features)
        st.write(f'Recommended Crop: {crop_prediction[0]}')


def yield_prediction():
    st.title('Yield Prediction System')
    
    # Load the trained model
    regressor = joblib.load('yield_prediction_model.pkl')

    # Input fields for soil and environmental conditions
    N = st.number_input('Nitrogen content in soil (kg/ha)', min_value=0, max_value=100, value=50)
    P = st.number_input('Phosphorus content in soil (kg/ha)', min_value=0, max_value=100, value=50)
    K = st.number_input('Potassium content in soil (kg/ha)', min_value=0, max_value=100, value=50)
    temperature = st.number_input('Temperature (°C)', min_value=0.0, max_value=50.0, value=25.0)
    humidity = st.number_input('Humidity (%)', min_value=0.0, max_value=100.0, value=50.0)
    ph = st.number_input('pH level of the soil', min_value=0.0, max_value=14.0, value=7.0)
    rainfall = st.number_input('Rainfall (mm)', min_value=0.0, max_value=500.0, value=100.0)

    # Predict button
    if st.button('Predict Yield'):
        # Prepare the input data for prediction
        input_features = np.array([[N, P, K, temperature, humidity, ph, rainfall]])
        # Make predictions
        yield_prediction = regressor.predict(input_features)
        st.write(f'Predicted Crop Yield: {yield_prediction[0]:.2f} kg/ha')



def main():
    st.sidebar.title("Navigation")
    selection = st.sidebar.radio("Go to", ["Crop Recommendation", "Yield Prediction"])

    if selection == "Crop Recommendation":
        crop_recommendation()
    elif selection == "Yield Prediction":
        yield_prediction()

if __name__ == '__main__':
    main()
