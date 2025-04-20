@RestController
public class HelloController {
    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Collections.singletonMap("message", "Hello from DevOps project!");
    }
}
