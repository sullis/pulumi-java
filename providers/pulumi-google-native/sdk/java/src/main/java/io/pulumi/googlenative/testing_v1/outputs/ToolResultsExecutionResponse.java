// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ToolResultsExecutionResponse {
    /**
     * A tool results execution ID.
     * 
     */
    private final String executionId;
    /**
     * A tool results history ID.
     * 
     */
    private final String historyId;
    /**
     * The cloud project that owns the tool results execution.
     * 
     */
    private final String project;

    @CustomType.Constructor
    private ToolResultsExecutionResponse(
        @CustomType.Parameter("executionId") String executionId,
        @CustomType.Parameter("historyId") String historyId,
        @CustomType.Parameter("project") String project) {
        this.executionId = executionId;
        this.historyId = historyId;
        this.project = project;
    }

    /**
     * A tool results execution ID.
     * 
    */
    public String getExecutionId() {
        return this.executionId;
    }
    /**
     * A tool results history ID.
     * 
    */
    public String getHistoryId() {
        return this.historyId;
    }
    /**
     * The cloud project that owns the tool results execution.
     * 
    */
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolResultsExecutionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executionId;
        private String historyId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolResultsExecutionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionId = defaults.executionId;
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
        }

        public Builder executionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }
        public Builder historyId(String historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }        public ToolResultsExecutionResponse build() {
            return new ToolResultsExecutionResponse(executionId, historyId, project);
        }
    }
}
