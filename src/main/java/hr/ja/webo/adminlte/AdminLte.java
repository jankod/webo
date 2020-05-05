package hr.ja.webo.adminlte;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminLte {

    private String title = "";

    private Navbar navbar = new Navbar();

    private Breadcrumb breadcrumb = new Breadcrumb();

    private Content content;


    //language=InjectedFreeMarker
    private String htmlHead = """
             <head>
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1">
                <meta http-equiv="x-ua-compatible" content="ie=edge">
                <title>${title}</title>
                <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
                <link rel="stylesheet" href="dist/css/adminlte.min.css">
            </head>
            """;

    //language=InjectedFreeMarker
    private String htmlSidebar = """
             <aside class="main-sidebar sidebar-dark-primary elevation-4">
                    <!-- Brand Logo -->
                    <a href="index3.html" class="brand-link">
                        <img src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                             style="opacity: .8">
                        <span class="brand-text font-weight-light">AdminLTE 3</span>
                    </a>
                        
                    <!-- Sidebar -->
                    <div class="sidebar">
                        <!-- Sidebar user panel (optional) -->
                        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                            <div class="image">
                                <img src="dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                            </div>
                            <div class="info">
                                <a href="#" class="d-block">Alexander Pierce</a>
                            </div>
                        </div>
                        
                        <!-- Sidebar Menu -->
                        <nav class="mt-2">
                            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                                <li class="nav-item has-treeview menu-open">
                                    <a href="#" class="nav-link active">
                                        <i class="nav-icon fas fa-tachometer-alt"></i>
                                        <p>
                                            Starter Pages
                                            <i class="right fas fa-angle-left"></i>
                                        </p>
                                    </a>
                                </li>
                            </ul>
                        </nav>
                        <!-- /.sidebar-menu -->
                    </div>
                    <!-- /.sidebar -->
                </aside>
            """;

    //language=InjectedFreeMarker
    private String html = """
            <!DOCTYPE html>
            <html lang="en">
                ${htmlHead}
            <body class="hold-transition sidebar-mini">
            <div class="wrapper">
                        
               ${navbar}
                        
                <!-- Main Sidebar Container -->
               ${htmlSidebar}
                        
                <!-- Content Wrapper. Contains page content -->
                <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                        <div class="container-fluid">
                    <div class="content-header">
                            <div class="row mb-2">
                                <div class="col-sm-6">
                                    <h1 class="m-0 text-dark">${page.title} 1 222 3432</h1>
                                </div><!-- /.col -->
                                <div class="col-sm-6">
                                    ${breadcrumb}
                                </div><!-- /.col -->
                            </div><!-- /.row -->
                        </div><!-- /.container-fluid -->
                    </div>
                    <!-- /.content-header -->
                        
                    <!-- Main content -->
                    <div class="content">
                        <div class="container-fluid">
                            
                        </div><!-- /.container-fluid -->
                    </div>
                    <!-- /.content -->
                </div>
                <!-- /.content-wrapper -->
                        
                <!-- Main Footer -->
                <footer class="main-footer">
                    <!-- To the right -->
                    <div class="float-right d-none d-sm-inline">
                        Anything you want
                    </div>
                    <!-- Default to the left -->
                    <strong>Copyright &copy; 2014-2019 <a href="https://adminlte.io">AdminLTE.io</a>.</strong> All rights reserved.
                </footer>
            </div>
            <!-- ./wrapper -->
                        
            <!-- REQUIRED SCRIPTS -->
                        
            <!-- jQuery -->
            <script src="plugins/jquery/jquery.min.js"></script>
            <!-- Bootstrap 4 -->
            <script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
            <!-- AdminLTE App -->
            <script src="dist/js/adminlte.min.js"></script>
            </body>
            </html>
            """;
}
