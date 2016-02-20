<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Simple Spring Example">
        <meta name="author" content="Ernestas Kardzys">
        <link rel="icon" href="../../favicon.ico">

        <title>Simple Spring Example</title>

        <link href="/resources/bootstrap/css/custom.css" rel="stylesheet">
        <link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="/resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">

        <script src="/resources/jquery/jquery-2.2.0.js"></script>
        <script src="/resources/bootstrap/js/bootstrap.js"></script>

        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Simple Spring Example</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="/persons/all">Names</a></li>
                        <li><a href="/cars/all">Cars</a></li>
                        <li><a href="/arithmetic/">Arithmetic Functions</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>

        <div class="container">
            <div class="starter-template">
                <div class="jumbotron">
                    <h1>Simple Spring Example</h1>
                </div>

                <jsp:doBody />
            </div>

        </div><!-- /.container -->
    </body>
</html>
