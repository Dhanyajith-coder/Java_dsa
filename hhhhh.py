import time

# 1. INITIAL STATE
car_count = 5  # Number of cars waiting at the red light
light_color = "RED"

print("Starting Traffic Simulation... Press Ctrl+C to stop.")

for tick in range(1, 11):  # Runs for 10 seconds
    # 2. THE LOGIC
    if light_color == "RED":
        car_count += 3  # More cars arrive while it's red
        print(f"[{tick}s] Light is RED. Cars piling up: {car_count}")
        
        # Change light to GREEN after 5 seconds
        if tick >= 5:
            light_color = "GREEN"
            print("--- Light turned GREEN! ---")
            
    else:  # GREEN light
        car_count -= 4  # Cars drive away fast
        if car_count < 0:
            car_count = 0  # Can't have negative cars
        print(f"[{tick}s] Light is GREEN. Cars clearing out: {car_count}")
        
    time.sleep(1)