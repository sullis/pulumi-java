// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterPlainArgs Empty = new GetClusterPlainArgs();

    /**
     * A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. All alphabetical characters must be lower case, no hypens at the end, no two consecutive hyphens. Cluster name should be unique for all clusters within an AWS account
     * 
     */
    @Import(name="clusterIdentifier", required=true)
    private String clusterIdentifier;

    /**
     * @return A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. All alphabetical characters must be lower case, no hypens at the end, no two consecutive hyphens. Cluster name should be unique for all clusters within an AWS account
     * 
     */
    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }

    private GetClusterPlainArgs() {}

    private GetClusterPlainArgs(GetClusterPlainArgs $) {
        this.clusterIdentifier = $.clusterIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterPlainArgs $;

        public Builder() {
            $ = new GetClusterPlainArgs();
        }

        public Builder(GetClusterPlainArgs defaults) {
            $ = new GetClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterIdentifier A unique identifier for the cluster. You use this identifier to refer to the cluster for any subsequent cluster operations such as deleting or modifying. All alphabetical characters must be lower case, no hypens at the end, no two consecutive hyphens. Cluster name should be unique for all clusters within an AWS account
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        public GetClusterPlainArgs build() {
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            return $;
        }
    }

}
