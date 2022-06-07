// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssignmentArgs Empty = new GetAssignmentArgs();

    /**
     * The security assignment key - unique key for the standard assignment
     * 
     */
    @Import(name="assignmentId", required=true)
    private Output<String> assignmentId;

    /**
     * @return The security assignment key - unique key for the standard assignment
     * 
     */
    public Output<String> assignmentId() {
        return this.assignmentId;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAssignmentArgs() {}

    private GetAssignmentArgs(GetAssignmentArgs $) {
        this.assignmentId = $.assignmentId;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssignmentArgs $;

        public Builder() {
            $ = new GetAssignmentArgs();
        }

        public Builder(GetAssignmentArgs defaults) {
            $ = new GetAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignmentId The security assignment key - unique key for the standard assignment
         * 
         * @return builder
         * 
         */
        public Builder assignmentId(Output<String> assignmentId) {
            $.assignmentId = assignmentId;
            return this;
        }

        /**
         * @param assignmentId The security assignment key - unique key for the standard assignment
         * 
         * @return builder
         * 
         */
        public Builder assignmentId(String assignmentId) {
            return assignmentId(Output.of(assignmentId));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetAssignmentArgs build() {
            $.assignmentId = Objects.requireNonNull($.assignmentId, "expected parameter 'assignmentId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
