// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.KeyType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListWorkflowVersionTriggerCallbackUrlArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWorkflowVersionTriggerCallbackUrlArgs Empty = new ListWorkflowVersionTriggerCallbackUrlArgs();

    /**
     * The key type.
     * 
     */
    @Import(name="keyType")
    private @Nullable Output<Either<String,KeyType>> keyType;

    /**
     * @return The key type.
     * 
     */
    public Optional<Output<Either<String,KeyType>>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * The expiry time.
     * 
     */
    @Import(name="notAfter")
    private @Nullable Output<String> notAfter;

    /**
     * @return The expiry time.
     * 
     */
    public Optional<Output<String>> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
    private Output<String> triggerName;

    /**
     * @return The workflow trigger name.
     * 
     */
    public Output<String> triggerName() {
        return this.triggerName;
    }

    /**
     * The workflow versionId.
     * 
     */
    @Import(name="versionId", required=true)
    private Output<String> versionId;

    /**
     * @return The workflow versionId.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName", required=true)
    private Output<String> workflowName;

    /**
     * @return The workflow name.
     * 
     */
    public Output<String> workflowName() {
        return this.workflowName;
    }

    private ListWorkflowVersionTriggerCallbackUrlArgs() {}

    private ListWorkflowVersionTriggerCallbackUrlArgs(ListWorkflowVersionTriggerCallbackUrlArgs $) {
        this.keyType = $.keyType;
        this.notAfter = $.notAfter;
        this.resourceGroupName = $.resourceGroupName;
        this.triggerName = $.triggerName;
        this.versionId = $.versionId;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWorkflowVersionTriggerCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWorkflowVersionTriggerCallbackUrlArgs $;

        public Builder() {
            $ = new ListWorkflowVersionTriggerCallbackUrlArgs();
        }

        public Builder(ListWorkflowVersionTriggerCallbackUrlArgs defaults) {
            $ = new ListWorkflowVersionTriggerCallbackUrlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyType The key type.
         * 
         * @return builder
         * 
         */
        public Builder keyType(@Nullable Output<Either<String,KeyType>> keyType) {
            $.keyType = keyType;
            return this;
        }

        /**
         * @param keyType The key type.
         * 
         * @return builder
         * 
         */
        public Builder keyType(Either<String,KeyType> keyType) {
            return keyType(Output.of(keyType));
        }

        /**
         * @param keyType The key type.
         * 
         * @return builder
         * 
         */
        public Builder keyType(String keyType) {
            return keyType(Either.ofLeft(keyType));
        }

        /**
         * @param keyType The key type.
         * 
         * @return builder
         * 
         */
        public Builder keyType(KeyType keyType) {
            return keyType(Either.ofRight(keyType));
        }

        /**
         * @param notAfter The expiry time.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(@Nullable Output<String> notAfter) {
            $.notAfter = notAfter;
            return this;
        }

        /**
         * @param notAfter The expiry time.
         * 
         * @return builder
         * 
         */
        public Builder notAfter(String notAfter) {
            return notAfter(Output.of(notAfter));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param triggerName The workflow trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(Output<String> triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        /**
         * @param triggerName The workflow trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(String triggerName) {
            return triggerName(Output.of(triggerName));
        }

        /**
         * @param versionId The workflow versionId.
         * 
         * @return builder
         * 
         */
        public Builder versionId(Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        /**
         * @param versionId The workflow versionId.
         * 
         * @return builder
         * 
         */
        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        /**
         * @param workflowName The workflow name.
         * 
         * @return builder
         * 
         */
        public Builder workflowName(Output<String> workflowName) {
            $.workflowName = workflowName;
            return this;
        }

        /**
         * @param workflowName The workflow name.
         * 
         * @return builder
         * 
         */
        public Builder workflowName(String workflowName) {
            return workflowName(Output.of(workflowName));
        }

        public ListWorkflowVersionTriggerCallbackUrlArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            $.workflowName = Objects.requireNonNull($.workflowName, "expected parameter 'workflowName' to be non-null");
            return $;
        }
    }

}
