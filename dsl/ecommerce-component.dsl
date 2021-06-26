workspace "ECommerce Component View" "ECommerce Component View" {

    model {
        shopper = person "Shopper" "Person who purchases items.  This person can also rate items"
        merchant = person "Merchant" "Person who sells items."
	    admin = person "Admin" "Person who administers the system."
        analyst = person "Analyst" "Person who analyzes buying and selling trends"

        ecommerceSoftwareSystem = softwareSystem "E-Commerce System" "Allows for buyers and sellers to purchase and sell goods.  Also allows for business analysists to report on buying and selling trends." {
            webapp = container "Web Application" "Delivers the static content and the single-page application" "React"
            singlePageApplication = container "Single-Page Application" "Provides functionality to all users via their web browsers" "React"
            database = container "Database" "Stores user profiles and store items" "Postgres"
            apiApplication = container "API Application" "Back End Functionality" "Java SpringBoot" {
                signInController = component "Sign in Controller" "Allows users to sign into the E-Commerce System" "Spring MVC REST Controller"
                securityComponent = component "Security Component" "Provides functionality related to signing in, changing passwords, etc." "SpringBoot Microservice"
             
                userAdminController = component "User Component" "CRUD Operations for users" "SpringBoot Microservice" 
                userIdGenerator = component "User ID Generator" "Generates user ID's" "SpringBoot Microservice"
             
                productAdminController = component "Product Component" "CRUD Operations for products" "SpringBoot Microservice"
                productIdGenerator = component "Product ID Generator" "Generates product ID's" "SpringBoot Microservice"

                orderAdminController = component "Order Component" "CRUD Operations for orders" "SpringBoot Microservice"
                orderIdGenerator = component "Order ID Generator" "Generates order ID's" "SpringBoot Microservice"
            }
            mobileApp = container "Mobile Application" "Mobile Interface" "Kotlin"
        }

        shopper -> ecommerceSoftwareSystem "Uses"
        merchant -> ecommerceSoftwareSystem "Uses"
	    admin -> ecommerceSoftwareSystem "Uses"
        analyst -> ecommerceSoftwareSystem "Uses"

        shopper -> ecommerceSoftwareSystem "Uses the application"

        shopper -> webapp "Uses the Web Application to search, buy and return items"
        merchant -> webapp "Uses the Web Application to search, add, remove, sell and restock items"
        admin -> webapp "Uses the admin section of the application for maintanence of the system"
        analyst -> webapp "Uses the system to retrieve statistics for buying and selling trends"

        shopper -> mobileApp "Uses the Mobile Application to search, buy and return items"
        merchant -> mobileApp "Uses the Mobile Application to search, add, remove, sell, and restock items"
	    admin -> mobileApp "Uses the Mobile Application for monitoring and maintenance of the system"
        analyst -> mobileApp "Uses the Mobile Application to receive trending alerts of the system"

        webapp -> singlePageApplication "Webapp sends commands with application"
        singlePageApplication -> apiApplication "Front end communicates with the back end"
        apiApplication -> database "Uses the database to retrieve items, user data"

        singlePageApplication -> signInController "Makes API calls to" "JSON/HTTPS"
        mobileApp -> signInController "Makes API calls to" "JSON/HTTPS"
        singlePageApplication -> userAdminController "Makes API calls to" "JSON/HTTPS"
        mobileApp -> userAdminController "Makes API calls to" "JSON/HTTPS"
        singlePageApplication -> orderAdminController "Makes API calls to" "JSON/HTTPS"
        mobileApp -> orderAdminController "Makes API calls to" "JSON/HTTPS"
        singlePageApplication -> productAdminController "Makes API calls to" "JSON/HTTPS"
        mobileApp -> productAdminController "Makes API calls to" "JSON/HTTPS"


        signInController -> securityComponent "Uses"
        securityComponent -> database "Uses"

        userAdminController -> userIdGenerator "Uses"
        userIdGenerator -> database "Uses"

        productAdminController -> productIdGenerator "Uses"
        productIdGenerator -> database "Uses"

        orderAdminController -> orderIdGenerator "Uses"
        orderIdGenerator -> database "Uses"
    }

    views {
        systemContext ecommerceSoftwareSystem {
            include *
            autoLayout
            title "Context View"
        }

        container ecommerceSoftwareSystem "Containers" {
            include *
            autoLayout
            title "Container View"
        }

        component apiApplication "Components" {
            include *
            animation {
                singlePageApplication 
                mobileApp 
                database 
                signInController 
                securityComponent
                userAdminController
                userIdGenerator
                productAdminController
                productIdGenerator
                orderAdminController
                orderIdGenerator
            }
            autoLayout
            title "Component View"
        }

        

        styles {
            element "Software System" {
                background #1168bd
                color #ffffff
            }
            element "Container" {
                background #1168bd
                color #ffffff
            }
            element "Database" {
                shape Cylinder
                background #1168bd
                color #ffffff
                
            }
            element "Person" {
                shape person
                background #08427b
                color #ffffff
            }
            element "Component" {
                background #85bbf0
                color #000000
            }
        }
    }
    
}