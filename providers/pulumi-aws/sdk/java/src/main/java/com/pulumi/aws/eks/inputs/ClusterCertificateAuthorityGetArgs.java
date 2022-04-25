// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterCertificateAuthorityGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterCertificateAuthorityGetArgs Empty = new ClusterCertificateAuthorityGetArgs();

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

    private ClusterCertificateAuthorityGetArgs() {}

    private ClusterCertificateAuthorityGetArgs(ClusterCertificateAuthorityGetArgs $) {
        this.data = $.data;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterCertificateAuthorityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterCertificateAuthorityGetArgs $;

        public Builder() {
            $ = new ClusterCertificateAuthorityGetArgs();
        }

        public Builder(ClusterCertificateAuthorityGetArgs defaults) {
            $ = new ClusterCertificateAuthorityGetArgs(Objects.requireNonNull(defaults));
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

        public ClusterCertificateAuthorityGetArgs build() {
            return $;
        }
    }

}
