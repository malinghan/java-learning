## MVC 模式
    MVC 模式代表 Model-View-Controller（模型-视图-控制器） 模式。这种模式用于应用程序的分层开发。
    Model（模型） - 模型代表一个存取数据的对象或 JAVA POJO。它也可以带有逻辑，在数据变化时更新控制器。
    View（视图） - 视图代表模型包含的数据的可视化。
    Controller（控制器） - 控制器作用于模型和视图上。它控制数据流向模型对象，并在数据变化时更新视图。它使视图与模型分离开。
    实现
    我们将创建一个作为模型的 Student 对象。StudentView 是一个把学生详细信息输出到控制台的视图类，StudentController 是负责存储数据到 Student 对象中的控制器类，并相应地更新视图 StudentView。
    MVCPatternDemo，我们的演示类使用 StudentController 来演示 MVC 模式的用法。

  ![image](http://www.runoob.com/wp-content/uploads/2014/08/mvc_pattern_uml_diagram.jpg)


## 业务代表模式
    业务代表模式（Business Delegate Pattern）用于`对表示层和业务层解耦`。它基本上是用来减少通信或对表示层代码中的业务层代码的远程查询功能。
    在业务层中我们有以下实体：
    客户端（Client） - 表示层代码可以是 JSP、servlet 或 UI java 代码。
    业务代表（Business Delegate） - 一个为客户端实体提供的入口类，它提供了对业务服务方法的访问。
    查询服务（LookUp Service） - 查找服务对象负责获取相关的业务实现，并提供业务对象对业务代表对象的访问。
    业务服务（Business Service） - 业务服务接口。实现了该业务服务的实体类，提供了实际的业务实现逻辑。
    实现
    我们将创建 Client、BusinessDelegate、BusinessService、LookUpService、JMSService 和 EJBService 来表示业务代表模式中的各种实体。
    BusinessDelegatePatternDemo，我们的演示类使用 BusinessDelegate 和 Client 来演示业务代表模式的用法。
    Service层的设计 Dao/Manager/Vo

##  组合实体模式
       组合实体模式（Composite Entity Pattern）用在 `EJB 持久化机制`中。
       一个组合实体是一个 EJB 实体 bean，代表了对象的图解。当更新一个组合实体时，内部依赖对象 beans 会自动更新，因为它们是由 EJB 实体 bean 管理的。
       以下是组合实体 bean 的参与者。
       组合实体（Composite Entity） - 它是主要的实体 bean。它可以是粗粒的，或者可以包含一个粗粒度对象，用于持续生命周期。
       粗粒度对象（Coarse-Grained Object） - 该对象包含依赖对象。它有自己的生命周期，也能管理依赖对象的生命周期。
       依赖对象（Dependent Object） - 依赖对象是一个持续生命周期依赖于粗粒度对象的对象。
       策略（Strategies） - 策略表示如何实现组合实体。
       实现
       我们将创建作为组合实体的 CompositeEntity 对象。CoarseGrainedObject 是一个包含依赖对象的类。
        CompositeEntityPatternDemo，我们的演示类使用 Client 类来演示组合实体模式的用法。

## 数据访问对象模式
     数据访问对象模式（Data Access Object Pattern）或 DAO 模式用于把低级的数据访问 API 或操作从高级的业务服务中分离出来。以下是数据访问对象模式的参与者。
     数据访问对象接口（Data Access Object Interface） - 该接口定义了在一个模型对象上要执行的标准操作。
     数据访问对象实体类（Data Access Object concrete class） - 该类实现了上述的接口。该类负责从数据源获取数据，数据源可以是数据库，也可以是 xml，或者是其他的存储机制。
     模型对象/数值对象（Model Object/Value Object） - 该对象是简单的 POJO，包含了 get/set 方法来存储通过使用 DAO 类检索到的数据。
     实现
     我们将创建一个作为模型对象或数值对象的 Student 对象。StudentDao 是数据访问对象接口。StudentDaoImpl 是实现了数据访问对象接口的实体类。DaoPatternDemo，我们的演示类使用 StudentDao 来演示数据访问对象模式的用法

## 前端控制器模式
     前端控制器模式（Front Controller Pattern）是用来提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。
     该处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。以下是这种设计模式的实体。
     前端控制器（Front Controller） - 处理应用程序所有类型请求的单个处理程序，应用程序可以是基于 web 的应用程序，也可以是基于桌面的应用程序。
     调度器（Dispatcher） - 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。
     视图（View） - 视图是为请求而创建的对象。
     实现
     我们将创建 FrontController、Dispatcher 分别当作前端控制器和调度器。HomeView 和 StudentView 表示各种为前端控制器接收到的请求而创建的视图。
     FrontControllerPatternDemo，我们的演示类使用 FrontController 来演示前端控制器设计模式。

##  拦截过滤器模式
     拦截过滤器模式（Intercepting Filter Pattern）用于对应用程序的请求或响应做一些预处理/后处理。
     定义过滤器，并在把请求传给实际目标应用程序之前应用在请求上。过滤器可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。以下是这种设计模式的实体。
     过滤器（Filter） - 过滤器在请求处理程序执行请求之前或之后，执行某些任务。
     过滤器链（Filter Chain） - 过滤器链带有多个过滤器，并在 Target 上按照定义的顺序执行这些过滤器。
     Target - Target 对象是请求处理程序。
     过滤管理器（Filter Manager） - 过滤管理器管理过滤器和过滤器链。
     客户端（Client） - Client 是向 Target 对象发送请求的对象。
     实现
     我们将创建 FilterChain、FilterManager、Target、Client 作为表示实体的各种对象。AuthenticationFilter 和 DebugFilter 表示实体过滤器。

##  服务定位器模式
      服务定位器模式（Service Locator Pattern）用在我们想使用 JNDI 查询定位各种服务的时候。
      考虑到为某个服务查找 JNDI 的代价很高，服务定位器模式充分利用了缓存技术。
      在首次请求某个服务时，服务定位器在 JNDI 中查找服务，并缓存该服务对象。
      当再次请求相同的服务时，服务定位器会在它的缓存中查找，这样可以在很大程度上提高应用程序的性能。以下是这种设计模式的实体。
      服务（Service） - 实际处理请求的服务。对这种服务的引用可以在 JNDI 服务器中查找到。
      Context / 初始的 Context - JNDI Context 带有对要查找的服务的引用。
      服务定位器（Service Locator） - 服务定位器是通过 JNDI 查找和缓存服务来获取服务的单点接触。
      缓存（Cache） - 缓存存储服务的引用，以便复用它们。
      客户端（Client） - Client 是通过 ServiceLocator 调用服务的对象。
       我们将创建 ServiceLocator、InitialContext、Cache、Service 作为表示实体的各种对象。Service1 和 Service2 表示实体服务。
       ServiceLocatorPatternDemo，我们的演示类在这里是作为一个客户端，将使用 ServiceLocator 来演示服务定位器设计模式。

##  传输定位模式
       传输对象模式（Transfer Object Pattern）用于从客户端向服务器一次性传递带有多个属性的数据。
       传输对象也被称为数值对象。传输对象是一个具有 getter/setter 方法的简单的 POJO 类，它是可序列化的，所以它可以通过网络传输。
       它没有任何的行为。服务器端的业务类通常从数据库读取数据，然后填充 POJO，并把它发送到客户端或按值传递它。对于客户端，传输对象是只读的。
       客户端可以创建自己的传输对象，并把它传递给服务器，以便一次性更新数据库中的数值。以下是这种设计模式的实体。
       业务对象（Business Object） - 为传输对象填充数据的业务服务。
       传输对象（Transfer Object） - 简单的 POJO，只有设置/获取属性的方法。
       客户端（Client） - 客户端可以发送请求或者发送传输对象到业务对象。
       实现：
       我们将创建一个作为业务对象的 StudentBO 和作为传输对象的 StudentVO，它们都代表了我们的实体。
       TransferObjectPatternDemo，我们的演示类在这里是作为一个客户端，将使用 StudentBO 和 Student 来演示传输对象设计模式。
