// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiIssueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiIssueArgs Empty = new GetApiIssueArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="apiId", required=true)
    private String apiId;

    /**
     * @return API identifier. Must be unique in the current API Management service instance.
     * 
     */
    public String apiId() {
        return this.apiId;
    }

    /**
     * Expand the comment attachments.
     * 
     */
    @Import(name="expandCommentsAttachments")
    private @Nullable Boolean expandCommentsAttachments;

    /**
     * @return Expand the comment attachments.
     * 
     */
    public Optional<Boolean> expandCommentsAttachments() {
        return Optional.ofNullable(this.expandCommentsAttachments);
    }

    /**
     * Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="issueId", required=true)
    private String issueId;

    /**
     * @return Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    public String issueId() {
        return this.issueId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetApiIssueArgs() {}

    private GetApiIssueArgs(GetApiIssueArgs $) {
        this.apiId = $.apiId;
        this.expandCommentsAttachments = $.expandCommentsAttachments;
        this.issueId = $.issueId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiIssueArgs $;

        public Builder() {
            $ = new GetApiIssueArgs();
        }

        public Builder(GetApiIssueArgs defaults) {
            $ = new GetApiIssueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param expandCommentsAttachments Expand the comment attachments.
         * 
         * @return builder
         * 
         */
        public Builder expandCommentsAttachments(@Nullable Boolean expandCommentsAttachments) {
            $.expandCommentsAttachments = expandCommentsAttachments;
            return this;
        }

        /**
         * @param issueId Issue identifier. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder issueId(String issueId) {
            $.issueId = issueId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetApiIssueArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.issueId = Objects.requireNonNull($.issueId, "expected parameter 'issueId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
