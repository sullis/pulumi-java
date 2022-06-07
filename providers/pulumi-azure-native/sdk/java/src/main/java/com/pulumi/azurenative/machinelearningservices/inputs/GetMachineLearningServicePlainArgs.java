// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMachineLearningServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMachineLearningServicePlainArgs Empty = new GetMachineLearningServicePlainArgs();

    /**
     * Set to True to include Model details.
     * 
     */
    @Import(name="expand")
    private @Nullable Boolean expand;

    /**
     * @return Set to True to include Model details.
     * 
     */
    public Optional<Boolean> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group in which workspace is located.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Azure Machine Learning service.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return Name of the Azure Machine Learning service.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return Name of Azure Machine Learning workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetMachineLearningServicePlainArgs() {}

    private GetMachineLearningServicePlainArgs(GetMachineLearningServicePlainArgs $) {
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMachineLearningServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMachineLearningServicePlainArgs $;

        public Builder() {
            $ = new GetMachineLearningServicePlainArgs();
        }

        public Builder(GetMachineLearningServicePlainArgs defaults) {
            $ = new GetMachineLearningServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Set to True to include Model details.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable Boolean expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which workspace is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName Name of the Azure Machine Learning service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param workspaceName Name of Azure Machine Learning workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetMachineLearningServicePlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
