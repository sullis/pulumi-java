// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebServicePlainArgs Empty = new GetWebServicePlainArgs();

    /**
     * The region for which encrypted credential parameters are valid.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The region for which encrypted credential parameters are valid.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Name of the resource group in which the web service is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group in which the web service is located.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the web service.
     * 
     */
    @Import(name="webServiceName", required=true)
    private String webServiceName;

    /**
     * @return The name of the web service.
     * 
     */
    public String webServiceName() {
        return this.webServiceName;
    }

    private GetWebServicePlainArgs() {}

    private GetWebServicePlainArgs(GetWebServicePlainArgs $) {
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
        this.webServiceName = $.webServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebServicePlainArgs $;

        public Builder() {
            $ = new GetWebServicePlainArgs();
        }

        public Builder(GetWebServicePlainArgs defaults) {
            $ = new GetWebServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region The region for which encrypted credential parameters are valid.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group in which the web service is located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param webServiceName The name of the web service.
         * 
         * @return builder
         * 
         */
        public Builder webServiceName(String webServiceName) {
            $.webServiceName = webServiceName;
            return this;
        }

        public GetWebServicePlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.webServiceName = Objects.requireNonNull($.webServiceName, "expected parameter 'webServiceName' to be non-null");
            return $;
        }
    }

}
