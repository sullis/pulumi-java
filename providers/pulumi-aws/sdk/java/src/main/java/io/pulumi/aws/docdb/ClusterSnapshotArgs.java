// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterSnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterSnapshotArgs Empty = new ClusterSnapshotArgs();

    /**
     * The DocDB Cluster Identifier from which to take the snapshot.
     * 
     */
    @InputImport(name="dbClusterIdentifier", required=true)
      private final Input<String> dbClusterIdentifier;

    public Input<String> getDbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * The Identifier for the snapshot.
     * 
     */
    @InputImport(name="dbClusterSnapshotIdentifier", required=true)
      private final Input<String> dbClusterSnapshotIdentifier;

    public Input<String> getDbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier;
    }

    public ClusterSnapshotArgs(
        Input<String> dbClusterIdentifier,
        Input<String> dbClusterSnapshotIdentifier) {
        this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier, "expected parameter 'dbClusterIdentifier' to be non-null");
        this.dbClusterSnapshotIdentifier = Objects.requireNonNull(dbClusterSnapshotIdentifier, "expected parameter 'dbClusterSnapshotIdentifier' to be non-null");
    }

    private ClusterSnapshotArgs() {
        this.dbClusterIdentifier = Input.empty();
        this.dbClusterSnapshotIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dbClusterIdentifier;
        private Input<String> dbClusterSnapshotIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.dbClusterSnapshotIdentifier = defaults.dbClusterSnapshotIdentifier;
        }

        public Builder setDbClusterIdentifier(Input<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = Objects.requireNonNull(dbClusterIdentifier);
            return this;
        }

        public Builder setDbClusterIdentifier(String dbClusterIdentifier) {
            this.dbClusterIdentifier = Input.of(Objects.requireNonNull(dbClusterIdentifier));
            return this;
        }

        public Builder setDbClusterSnapshotIdentifier(Input<String> dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = Objects.requireNonNull(dbClusterSnapshotIdentifier);
            return this;
        }

        public Builder setDbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
            this.dbClusterSnapshotIdentifier = Input.of(Objects.requireNonNull(dbClusterSnapshotIdentifier));
            return this;
        }
        public ClusterSnapshotArgs build() {
            return new ClusterSnapshotArgs(dbClusterIdentifier, dbClusterSnapshotIdentifier);
        }
    }
}