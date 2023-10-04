<%-- 
    Document   : contact
    Created on : Oct 3, 2023, 11:02:26 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Contact</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.css"rel="stylesheet"/>
        <style>
            body {
                display: flex;
                justify-content: center;
                align-items: center;
                min-height: 100vh;
                margin: 0;
            }
        </style>
    </head>
    <body>
        <div style="width: 500px">
            <!-- Default form contact -->
            <form class="text-center border border-light p-5" action="result-login" method="post">

                <p class="h4 mb-4">Contact us</p>

                <!-- Name -->
                <input type="text" id="defaultContactFormName" name="subject" class="form-control mb-4" placeholder="Subject">

                <!-- Email -->
                <input type="email" id="defaultContactFormEmail" name="to" class="form-control mb-4" placeholder="E-mail">

                <!-- Message -->
                <div class="form-group mb-4">
                    <textarea class="form-control rounded-0" name="content" id="exampleFormControlTextarea2" rows="3" placeholder="Message"></textarea>
                </div>

                <!-- Send button -->
                <button class="btn btn-info btn-block" type="submit">Send</button>

            </form>
        </div>
        <!-- Default form contact -->
        <script
            type="text/javascript"src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.js"
        ></script>
    </body>
</html>
