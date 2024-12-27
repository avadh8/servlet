<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Input and Button</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f4f4f9;
        }

        .container {
            text-align: center;
            padding: 20px;
            background: #ffffff;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            max-width: 90%;
            width: 400px;
        }

        .container input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
        }

        .container button {
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        .container button:hover {
            background-color: #0056b3;
        }

        @media (max-width: 480px) {
            .container {
                padding: 15px;
            }

            .container input, .container button {
                font-size: 14px;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="session1">
            <input type="text" name="userInput" placeholder="Enter text here...">
            <button type="submit">Go to servlet1</button>
        </form>
    </div>
</body>
</html>
