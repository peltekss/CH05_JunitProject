import org.junit.*;

public class C03_Annotations {
/*
*** ANNOTATIONS ***
6 Temel Junit notasyonu vardır.
@Test: Bir metodun TEST CASE olarak işaretlenmesini sağlar.
@Before: Her @Test anotasyonundan önce çalışır.
@After: Her @Test anotasyonundan sonra çalışır.
@BeforeClass: Bir sınıfın her çalıştırılmasından önce yalnızca bir kez çalışır.
@AfterClass: Bir sınıfın her çalıştırılmasından sonra yalnızca bir kez çalışır.
@Ignore: Bir test case'in atlanmasını sağlar.
*/


    @Before//Her test anatasyonundan önce çalışır.
    public void beforeMethod(){
        System.out.println("Before Methodu");
    }

    @After//Her test anatasyonundan sonra çalışır.
    public void afterMethod(){
        System.out.println("Before Methodu");
    }

    @BeforeClass//Bir sınıfın her çalıştırılmasından önce yalnızca bir kez çalışır.
    public static void beforeClassMethod(){
        System.out.println("Before Class Methodu");
    }
    @AfterClass//Bir sınıfın her çalıştırılmasından sonra yalnızca bir kez çalışır.
    public static void afterClassMethod(){
        System.out.println("Before Class Methodu");
    }
    @Test
    public void test01(){
        System.out.println("test01");
    }
    @Test
    public void test02(){
        System.out.println("test02");
    }
    @Test
    public void test03(){
        System.out.println("test03");
    }
    @Test @Ignore //Bir test case'in atlanmasını sağlar
    public void test04(){
        System.out.println("test04");
    }
    @Test
    public void test05(){
        System.out.println("test05");
    }
}

