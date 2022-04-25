// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.TestIssueResponse;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.TestSuiteOverviewResponse;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.TestTimingResponse;
import com.pulumi.googlenative.toolresults_v1beta3.inputs.ToolExecutionResponse;
import java.util.List;
import java.util.Objects;


/**
 * A step that represents running tests. It accepts ant-junit xml files which will be parsed into structured test results by the service. Xml file paths are updated in order to append more files, however they can&#39;t be deleted. Users can also add test results manually by using the test_result field.
 * 
 */
public final class TestExecutionStepResponse extends com.pulumi.resources.InvokeArgs {

    public static final TestExecutionStepResponse Empty = new TestExecutionStepResponse();

    /**
     * Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    @Import(name="testIssues", required=true)
    private List<TestIssueResponse> testIssues;

    /**
     * @return Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    public List<TestIssueResponse> testIssues() {
        return this.testIssues;
    }

    /**
     * List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
     * 
     */
    @Import(name="testSuiteOverviews", required=true)
    private List<TestSuiteOverviewResponse> testSuiteOverviews;

    /**
     * @return List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
     * 
     */
    public List<TestSuiteOverviewResponse> testSuiteOverviews() {
        return this.testSuiteOverviews;
    }

    /**
     * The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    @Import(name="testTiming", required=true)
    private TestTimingResponse testTiming;

    /**
     * @return The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
     * 
     */
    public TestTimingResponse testTiming() {
        return this.testTiming;
    }

    /**
     * Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
     * 
     */
    @Import(name="toolExecution", required=true)
    private ToolExecutionResponse toolExecution;

    /**
     * @return Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
     * 
     */
    public ToolExecutionResponse toolExecution() {
        return this.toolExecution;
    }

    private TestExecutionStepResponse() {}

    private TestExecutionStepResponse(TestExecutionStepResponse $) {
        this.testIssues = $.testIssues;
        this.testSuiteOverviews = $.testSuiteOverviews;
        this.testTiming = $.testTiming;
        this.toolExecution = $.toolExecution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TestExecutionStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TestExecutionStepResponse $;

        public Builder() {
            $ = new TestExecutionStepResponse();
        }

        public Builder(TestExecutionStepResponse defaults) {
            $ = new TestExecutionStepResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param testIssues Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder testIssues(List<TestIssueResponse> testIssues) {
            $.testIssues = testIssues;
            return this;
        }

        /**
         * @param testIssues Issues observed during the test execution. For example, if the mobile app under test crashed during the test, the error message and the stack trace content can be recorded here to assist debugging. - In response: present if set by create or update - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder testIssues(TestIssueResponse... testIssues) {
            return testIssues(List.of(testIssues));
        }

        /**
         * @param testSuiteOverviews List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
         * 
         * @return builder
         * 
         */
        public Builder testSuiteOverviews(List<TestSuiteOverviewResponse> testSuiteOverviews) {
            $.testSuiteOverviews = testSuiteOverviews;
            return this;
        }

        /**
         * @param testSuiteOverviews List of test suite overview contents. This could be parsed from xUnit XML log by server, or uploaded directly by user. This references should only be called when test suites are fully parsed or uploaded. The maximum allowed number of test suite overviews per step is 1000. - In response: always set - In create request: optional - In update request: never (use publishXunitXmlFiles custom method instead)
         * 
         * @return builder
         * 
         */
        public Builder testSuiteOverviews(TestSuiteOverviewResponse... testSuiteOverviews) {
            return testSuiteOverviews(List.of(testSuiteOverviews));
        }

        /**
         * @param testTiming The timing break down of the test execution. - In response: present if set by create or update - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder testTiming(TestTimingResponse testTiming) {
            $.testTiming = testTiming;
            return this;
        }

        /**
         * @param toolExecution Represents the execution of the test runner. The exit code of this tool will be used to determine if the test passed. - In response: always set - In create/update request: optional
         * 
         * @return builder
         * 
         */
        public Builder toolExecution(ToolExecutionResponse toolExecution) {
            $.toolExecution = toolExecution;
            return this;
        }

        public TestExecutionStepResponse build() {
            $.testIssues = Objects.requireNonNull($.testIssues, "expected parameter 'testIssues' to be non-null");
            $.testSuiteOverviews = Objects.requireNonNull($.testSuiteOverviews, "expected parameter 'testSuiteOverviews' to be non-null");
            $.testTiming = Objects.requireNonNull($.testTiming, "expected parameter 'testTiming' to be non-null");
            $.toolExecution = Objects.requireNonNull($.toolExecution, "expected parameter 'toolExecution' to be non-null");
            return $;
        }
    }

}
