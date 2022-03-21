// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a tool results history resource.
 * 
 */
public final class ToolResultsHistoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final ToolResultsHistoryResponse Empty = new ToolResultsHistoryResponse();

    /**
     * A tool results history ID.
     * 
     */
    @Import(name="historyId", required=true)
      private final String historyId;

    public String getHistoryId() {
        return this.historyId;
    }

    /**
     * The cloud project that owns the tool results history.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    public ToolResultsHistoryResponse(
        String historyId,
        String project) {
        this.historyId = Objects.requireNonNull(historyId, "expected parameter 'historyId' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private ToolResultsHistoryResponse() {
        this.historyId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolResultsHistoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String historyId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolResultsHistoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
        }

        public Builder historyId(String historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }        public ToolResultsHistoryResponse build() {
            return new ToolResultsHistoryResponse(historyId, project);
        }
    }
}
