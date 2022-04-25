// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.inputs.OfficeDataConnectorDataTypesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OfficeDataConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final OfficeDataConnectorArgs Empty = new OfficeDataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @Import(name="dataConnectorId")
    private @Nullable Output<String> dataConnectorId;

    /**
     * @return Connector ID
     * 
     */
    public Optional<Output<String>> dataConnectorId() {
        return Optional.ofNullable(this.dataConnectorId);
    }

    /**
     * The available data types for the connector.
     * 
     */
    @Import(name="dataTypes")
    private @Nullable Output<OfficeDataConnectorDataTypesArgs> dataTypes;

    /**
     * @return The available data types for the connector.
     * 
     */
    public Optional<Output<OfficeDataConnectorDataTypesArgs>> dataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }

    /**
     * The kind of the data connector
     * Expected value is &#39;Office365&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return The kind of the data connector
     * Expected value is &#39;Office365&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
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

    /**
     * The tenant id to connect to, and get the data from.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return The tenant id to connect to, and get the data from.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private OfficeDataConnectorArgs() {}

    private OfficeDataConnectorArgs(OfficeDataConnectorArgs $) {
        this.dataConnectorId = $.dataConnectorId;
        this.dataTypes = $.dataTypes;
        this.kind = $.kind;
        this.resourceGroupName = $.resourceGroupName;
        this.tenantId = $.tenantId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OfficeDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OfficeDataConnectorArgs $;

        public Builder() {
            $ = new OfficeDataConnectorArgs();
        }

        public Builder(OfficeDataConnectorArgs defaults) {
            $ = new OfficeDataConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataConnectorId Connector ID
         * 
         * @return builder
         * 
         */
        public Builder dataConnectorId(@Nullable Output<String> dataConnectorId) {
            $.dataConnectorId = dataConnectorId;
            return this;
        }

        /**
         * @param dataConnectorId Connector ID
         * 
         * @return builder
         * 
         */
        public Builder dataConnectorId(String dataConnectorId) {
            return dataConnectorId(Output.of(dataConnectorId));
        }

        /**
         * @param dataTypes The available data types for the connector.
         * 
         * @return builder
         * 
         */
        public Builder dataTypes(@Nullable Output<OfficeDataConnectorDataTypesArgs> dataTypes) {
            $.dataTypes = dataTypes;
            return this;
        }

        /**
         * @param dataTypes The available data types for the connector.
         * 
         * @return builder
         * 
         */
        public Builder dataTypes(OfficeDataConnectorDataTypesArgs dataTypes) {
            return dataTypes(Output.of(dataTypes));
        }

        /**
         * @param kind The kind of the data connector
         * Expected value is &#39;Office365&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of the data connector
         * Expected value is &#39;Office365&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
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

        /**
         * @param tenantId The tenant id to connect to, and get the data from.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId The tenant id to connect to, and get the data from.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public OfficeDataConnectorArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
