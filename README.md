**Note on Environment Variables:**

![image](https://user-images.githubusercontent.com/9147189/249979741-757ff724-a75e-4d3b-934f-e6af73d630e2.png)

## Running Tests
1. Using IntelliJ IDEA:
- Go to Maven Profiles
- Select either `android` or `ios` Maven Profile as the platform
- Choose `dev`, `qa`, `uat`, `pre-prod`, or `prod` as the environment
- Locate the test classes in the `src/test/java` folder
- Right-click and select `Run`

2. Using Command Line:
- To run the smoke test suite on Android against the QA environment, use this command:

  ```
  mvn clean test -Pandroid,qa,smoke-test
  ```

- To run the regression test suite on iOS against the UAT environment, use this command:

  ```
  mvn clean test -Pios,uat,regression-test
  ```

**Note**: If no Maven profiles are selected, the default setup will execute tests on the `android` platform within the `dev` environment.

## License
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/License_icon-mit-2.svg/2000px-License_icon-mit-2.svg.png" alt="MIT License" width="100" height="100"/> [MIT License](https://opensource.org/licenses/MIT)
