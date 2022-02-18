// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.azurenative.testbase.inputs.CommandResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of a Test.
 * 
 */
public final class TestResponse extends io.pulumi.resources.InvokeArgs {

    public static final TestResponse Empty = new TestResponse();

    /**
     * The commands used in the test.
     * 
     */
    @InputImport(name="commands", required=true)
    private final List<CommandResponse> commands;

    public List<CommandResponse> getCommands() {
        return this.commands;
    }

    /**
     * Indicates if this test is active.It doesn't schedule test for not active Test.
     * 
     */
    @InputImport(name="isActive")
    private final @Nullable Boolean isActive;

    public Optional<Boolean> getIsActive() {
        return this.isActive == null ? Optional.empty() : Optional.ofNullable(this.isActive);
    }

    /**
     * The type of the test.
     * 
     */
    @InputImport(name="testType", required=true)
    private final String testType;

    public String getTestType() {
        return this.testType;
    }

    /**
     * The status of the validation run of the package.
     * 
     */
    @InputImport(name="validationRunStatus", required=true)
    private final String validationRunStatus;

    public String getValidationRunStatus() {
        return this.validationRunStatus;
    }

    public TestResponse(
        List<CommandResponse> commands,
        @Nullable Boolean isActive,
        String testType,
        String validationRunStatus) {
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.isActive = isActive;
        this.testType = Objects.requireNonNull(testType, "expected parameter 'testType' to be non-null");
        this.validationRunStatus = Objects.requireNonNull(validationRunStatus, "expected parameter 'validationRunStatus' to be non-null");
    }

    private TestResponse() {
        this.commands = List.of();
        this.isActive = null;
        this.testType = null;
        this.validationRunStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CommandResponse> commands;
        private @Nullable Boolean isActive;
        private String testType;
        private String validationRunStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(TestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.isActive = defaults.isActive;
    	      this.testType = defaults.testType;
    	      this.validationRunStatus = defaults.validationRunStatus;
        }

        public Builder setCommands(List<CommandResponse> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder setIsActive(@Nullable Boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder setTestType(String testType) {
            this.testType = Objects.requireNonNull(testType);
            return this;
        }

        public Builder setValidationRunStatus(String validationRunStatus) {
            this.validationRunStatus = Objects.requireNonNull(validationRunStatus);
            return this;
        }

        public TestResponse build() {
            return new TestResponse(commands, isActive, testType, validationRunStatus);
        }
    }
}
