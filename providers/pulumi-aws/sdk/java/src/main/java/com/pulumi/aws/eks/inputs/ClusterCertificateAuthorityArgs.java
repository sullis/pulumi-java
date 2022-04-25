// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCertificateAuthorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCertificateAuthorityArgs Empty = new ClusterCertificateAuthorityArgs();

    /**
     * Base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
     */
    @Import(name="data")
    private @Nullable Output<String> data;

    /**
     * @return Base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
     * 
     */
    public Optional<Output<String>> data() {
        return Optional.ofNullable(this.data);
    }

    private ClusterCertificateAuthorityArgs() {}

    private ClusterCertificateAuthorityArgs(ClusterCertificateAuthorityArgs $) {
        this.data = $.data;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCertificateAuthorityArgs $;

        public Builder() {
            $ = new ClusterCertificateAuthorityArgs();
        }

        public Builder(ClusterCertificateAuthorityArgs defaults) {
            $ = new ClusterCertificateAuthorityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param data Base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Output<String> data) {
            $.data = data;
            return this;
        }

        /**
         * @param data Base64 encoded certificate data required to communicate with your cluster. Add this to the `certificate-authority-data` section of the `kubeconfig` file for your cluster.
         * 
         * @return builder
         * 
         */
        public Builder data(String data) {
            return data(Output.of(data));
        }

        public ClusterCertificateAuthorityArgs build() {
            return $;
        }
    }

}
