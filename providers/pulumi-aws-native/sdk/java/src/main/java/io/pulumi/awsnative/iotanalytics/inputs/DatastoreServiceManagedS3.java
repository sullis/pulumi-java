// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import java.util.Objects;


public final class DatastoreServiceManagedS3 extends io.pulumi.resources.InvokeArgs {

    public static final DatastoreServiceManagedS3 Empty = new DatastoreServiceManagedS3();

    public DatastoreServiceManagedS3() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreServiceManagedS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreServiceManagedS3 defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public DatastoreServiceManagedS3 build() {
            return new DatastoreServiceManagedS3();
        }
    }
}
