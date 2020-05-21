//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(Application.class)
//public class ApplicationTests {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Before
//    public void before() {
//        userRepository.save(new User("AAA", 10));
//    }
//
//    @Test
//    public void test() throws Exception {
//        User u1 = userRepository.findByName("AAA");
//        System.out.println("第一次查询：" + u1.getAge());
//
//        User u2 = userRepository.findByName("AAA");
//        System.out.println("第二次查询：" + u2.getAge());
//    }
//
//}
