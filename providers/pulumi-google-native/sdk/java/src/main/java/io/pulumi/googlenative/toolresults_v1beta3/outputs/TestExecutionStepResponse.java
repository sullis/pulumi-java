// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.TestIssueResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.TestSuiteOverviewResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.TestTimingResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.ToolExecutionResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TestExecutionStepResponse {
    /**
     * Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    private final List<TestIssueResponse> testIssues;
    /**
     * List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
     * 
     */
    private final List<TestSuiteOverviewResponse> testSuiteOverviews;
    /**
     * The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    private final TestTimingResponse testTiming;
    /**
     * Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
     * 
     */
    private final ToolExecutionResponse toolExecution;

    @CustomType.Constructor
    private TestExecutionStepResponse(
        @CustomType.Parameter("testIssues") List<TestIssueResponse> testIssues,
        @CustomType.Parameter("testSuiteOverviews") List<TestSuiteOverviewResponse> testSuiteOverviews,
        @CustomType.Parameter("testTiming") TestTimingResponse testTiming,
        @CustomType.Parameter("toolExecution") ToolExecutionResponse toolExecution) {
        this.testIssues = testIssues;
        this.testSuiteOverviews = testSuiteOverviews;
        this.testTiming = testTiming;
        this.toolExecution = toolExecution;
    }

    /**
     * Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
     * 
    */
    public List<TestIssueResponse> getTestIssues() {
        return this.testIssues;
    }
    /**
     * List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
     * 
    */
    public List<TestSuiteOverviewResponse> getTestSuiteOverviews() {
        return this.testSuiteOverviews;
    }
    /**
     * The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
     * 
    */
    public TestTimingResponse getTestTiming() {
        return this.testTiming;
    }
    /**
     * Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
     * 
    */
    public ToolExecutionResponse getToolExecution() {
        return this.toolExecution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestExecutionStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TestIssueResponse> testIssues;
        private List<TestSuiteOverviewResponse> testSuiteOverviews;
        private TestTimingResponse testTiming;
        private ToolExecutionResponse toolExecution;

        public Builder() {
    	      // Empty
        }

        public Builder(TestExecutionStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testIssues = defaults.testIssues;
    	      this.testSuiteOverviews = defaults.testSuiteOverviews;
    	      this.testTiming = defaults.testTiming;
    	      this.toolExecution = defaults.toolExecution;
        }

        public Builder testIssues(List<TestIssueResponse> testIssues) {
            this.testIssues = Objects.requireNonNull(testIssues);
            return this;
        }
        public Builder testIssues(TestIssueResponse... testIssues) {
            return testIssues(List.of(testIssues));
        }
        public Builder testSuiteOverviews(List<TestSuiteOverviewResponse> testSuiteOverviews) {
            this.testSuiteOverviews = Objects.requireNonNull(testSuiteOverviews);
            return this;
        }
        public Builder testSuiteOverviews(TestSuiteOverviewResponse... testSuiteOverviews) {
            return testSuiteOverviews(List.of(testSuiteOverviews));
        }
        public Builder testTiming(TestTimingResponse testTiming) {
            this.testTiming = Objects.requireNonNull(testTiming);
            return this;
        }
        public Builder toolExecution(ToolExecutionResponse toolExecution) {
            this.toolExecution = Objects.requireNonNull(toolExecution);
            return this;
        }        public TestExecutionStepResponse build() {
            return new TestExecutionStepResponse(testIssues, testSuiteOverviews, testTiming, toolExecution);
        }
    }
}
