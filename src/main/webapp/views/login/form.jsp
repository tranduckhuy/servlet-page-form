<%-- 
    Document   : form
    Created on : Oct 2, 2023, 9:59:09 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.css"rel="stylesheet"/>
        <style>
            body {
                display: flex;
                justify-content: center;
                align-items: center;
                min-height: 100vh;
                margin: 0;
            }
            
            .bg {
                background: linear-gradient(to right, #ee7724, #d8363a, #dd3675, #b44593);
            }
        </style>
    </head>
    <body>
        <div style="width: 500px">
            <form action="check-login" method="post">
                <p style="font-weight: 600">Please login to your account</p>

                <div class="form-outline mb-4">
                    <input type="text" name="username" id="username" class="form-control" placeholder="Phone number or email address" required/>
                    <label class="form-label" for="username">Username</label>
                </div>

                <div class="form-outline mb-4">
                    <input type="password" name="password" id="password" class="form-control" required/>
                    <label class="form-label" for="password">Password</label>
                </div>

                <div class="text-center pt-1 mb-5 pb-1">
                    <button class="btn btn-primary btn-block bg" type="submit">Login</button>
                </div>
            </form>
        </div>
        <script
            type="text/javascript"src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.js"
        ></script>
    </body>
</html>
