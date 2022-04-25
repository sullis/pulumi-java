// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a tool results history resource.
 * 
 */
public final class ToolResultsHistoryResponse extends com.pulumi.resources.InvokeArgs {

    public static final ToolResultsHistoryResponse Empty = new ToolResultsHistoryResponse();

    /**
     * A tool results history ID.
     * 
     */
    @Import(name="historyId", required=true)
    private String historyId;

    /**
     * @return A tool results history ID.
     * 
     */
    public String historyId() {
        return this.historyId;
    }

    /**
     * The cloud project that owns the tool results history.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The cloud project that owns the tool results history.
     * 
     */
    public String project() {
        return this.project;
    }

    private ToolResultsHistoryResponse() {}

    private ToolResultsHistoryResponse(ToolResultsHistoryResponse $) {
        this.historyId = $.historyId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ToolResultsHistoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ToolResultsHistoryResponse $;

        public Builder() {
            $ = new ToolResultsHistoryResponse();
        }

        public Builder(ToolResultsHistoryResponse defaults) {
            $ = new ToolResultsHistoryResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param historyId A tool results history ID.
         * 
         * @return builder
         * 
         */
        public Builder historyId(String historyId) {
            $.historyId = historyId;
            return this;
        }

        /**
         * @param project The cloud project that owns the tool results history.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public ToolResultsHistoryResponse build() {
            $.historyId = Objects.requireNonNull($.historyId, "expected parameter 'historyId' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
