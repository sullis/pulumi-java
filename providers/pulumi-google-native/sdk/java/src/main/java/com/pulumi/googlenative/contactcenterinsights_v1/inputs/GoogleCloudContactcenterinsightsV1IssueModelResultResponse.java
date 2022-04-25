// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1IssueAssignmentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Issue Modeling result on a conversation.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1IssueModelResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1IssueModelResultResponse Empty = new GoogleCloudContactcenterinsightsV1IssueModelResultResponse();

    /**
     * Issue model that generates the result. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * 
     */
    @Import(name="issueModel", required=true)
    private String issueModel;

    /**
     * @return Issue model that generates the result. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * 
     */
    public String issueModel() {
        return this.issueModel;
    }

    /**
     * All the matched issues.
     * 
     */
    @Import(name="issues", required=true)
    private List<GoogleCloudContactcenterinsightsV1IssueAssignmentResponse> issues;

    /**
     * @return All the matched issues.
     * 
     */
    public List<GoogleCloudContactcenterinsightsV1IssueAssignmentResponse> issues() {
        return this.issues;
    }

    private GoogleCloudContactcenterinsightsV1IssueModelResultResponse() {}

    private GoogleCloudContactcenterinsightsV1IssueModelResultResponse(GoogleCloudContactcenterinsightsV1IssueModelResultResponse $) {
        this.issueModel = $.issueModel;
        this.issues = $.issues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1IssueModelResultResponse $;

        public Builder() {
            $ = new GoogleCloudContactcenterinsightsV1IssueModelResultResponse();
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelResultResponse defaults) {
            $ = new GoogleCloudContactcenterinsightsV1IssueModelResultResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param issueModel Issue model that generates the result. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
         * 
         * @return builder
         * 
         */
        public Builder issueModel(String issueModel) {
            $.issueModel = issueModel;
            return this;
        }

        /**
         * @param issues All the matched issues.
         * 
         * @return builder
         * 
         */
        public Builder issues(List<GoogleCloudContactcenterinsightsV1IssueAssignmentResponse> issues) {
            $.issues = issues;
            return this;
        }

        /**
         * @param issues All the matched issues.
         * 
         * @return builder
         * 
         */
        public Builder issues(GoogleCloudContactcenterinsightsV1IssueAssignmentResponse... issues) {
            return issues(List.of(issues));
        }

        public GoogleCloudContactcenterinsightsV1IssueModelResultResponse build() {
            $.issueModel = Objects.requireNonNull($.issueModel, "expected parameter 'issueModel' to be non-null");
            $.issues = Objects.requireNonNull($.issues, "expected parameter 'issues' to be non-null");
            return $;
        }
    }

}
