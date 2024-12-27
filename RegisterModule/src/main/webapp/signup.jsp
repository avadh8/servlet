<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modern Glassmorphic Form</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #ece9e6, #ffffff);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            overflow: hidden;
        }

        .form-container {
            backdrop-filter: blur(10px) saturate(180%);
            -webkit-backdrop-filter: blur(10px) saturate(180%);
            background-color: rgba(255, 255, 255, 0.7);
            border-radius: 12px;
            border: 1px solid rgba(209, 213, 219, 0.3);
            box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.2);
            padding: 30px;
            max-width: 400px;
            width: 100%;
            text-align: center;
        }

        .form-container h2 {
            margin-bottom: 20px;
            color: #333;
            font-size: 24px;
        }

        .form-group {
            margin-bottom: 15px;
            text-align: left;
        }

        .form-group label {
            font-size: 14px;
            margin-bottom: 5px;
            display: block;
            color: #555;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 6px;
            background: #f9f9f9;
            font-size: 14px;
            outline: none;
            transition: border-color 0.3s;
        }

        .form-group input:focus {
            border-color: #3b82f6;
        }

        .submit-btn {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 6px;
            background: linear-gradient(90deg, #4facfe, #00f2fe);
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s;
        }

        .submit-btn:hover {
            background: linear-gradient(90deg, #00f2fe, #4facfe);
        }

        .loader {
            display: none;
            border: 4px solid rgba(255, 255, 255, 0.7);
            border-top: 4px solid #3b82f6;
            border-radius: 50%;
            width: 40px;
            height: 40px;
            animation: spin 1s linear infinite;
            margin: 20px auto 0;
        }

        @keyframes spin {
            0% {
                transform: rotate(0deg);
            }
            100% {
                transform: rotate(360deg);
            }
        }

        @media (max-width: 600px) {
            .form-container {
                padding: 20px;
            }

            .form-container h2 {
                font-size: 20px;
            }
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Create Account</h2>
        <form id="registerForm" action="register" method="post" onsubmit="this.classList.add('submitting');">
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" placeholder="Enter your username" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" placeholder="Enter your email" required>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" placeholder="Enter your password" required>
            </div>
            <button type="submit" class="submit-btn">Register</button>
            <div class="loader"></div>
        </form>
    </div>
</body>
</html>