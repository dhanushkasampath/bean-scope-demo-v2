Singleton
1. Default scope
2. Eager initialization

Prototype
1. Each time new object is created
2. Lazily initialized - New Object is created each time - created when needed

Request
1. One bean per HTTP request
2. Lazily initialized
3. Proxy mode - When injecting request scoped beans into singleton scoped bean