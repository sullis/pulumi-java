// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFargateProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFargateProfileArgs Empty = new GetFargateProfileArgs();

    /**
     * Name of the Cluster
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return Name of the Cluster
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Name of FargateProfile
     * 
     */
    @Import(name="fargateProfileName", required=true)
    private String fargateProfileName;

    /**
     * @return Name of FargateProfile
     * 
     */
    public String fargateProfileName() {
        return this.fargateProfileName;
    }

    private GetFargateProfileArgs() {}

    private GetFargateProfileArgs(GetFargateProfileArgs $) {
        this.clusterName = $.clusterName;
        this.fargateProfileName = $.fargateProfileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFargateProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFargateProfileArgs $;

        public Builder() {
            $ = new GetFargateProfileArgs();
        }

        public Builder(GetFargateProfileArgs defaults) {
            $ = new GetFargateProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the Cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param fargateProfileName Name of FargateProfile
         * 
         * @return builder
         * 
         */
        public Builder fargateProfileName(String fargateProfileName) {
            $.fargateProfileName = fargateProfileName;
            return this;
        }

        public GetFargateProfileArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.fargateProfileName = Objects.requireNonNull($.fargateProfileName, "expected parameter 'fargateProfileName' to be non-null");
            return $;
        }
    }

}
