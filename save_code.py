import requests
import json

url = "http://127.0.0.1:5000/save"
data = {
    "filename": "gfg_problem1.py",   # yaha problem ka naam ya file ka naam dogi
    "code": "print('Hello from GFG problem!')"  # yaha apna code daalna hai
}

response = requests.post(url, json=data)
print(response.text)
