// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Description of an input or output of an execution stage.
 * 
 */
public final class StageSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final StageSourceResponse Empty = new StageSourceResponse();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    @Import(name="originalTransformOrCollection", required=true)
      private final String originalTransformOrCollection;

    public String getOriginalTransformOrCollection() {
        return this.originalTransformOrCollection;
    }

    /**
     * Size of the source, if measurable.
     * 
     */
    @Import(name="sizeBytes", required=true)
      private final String sizeBytes;

    public String getSizeBytes() {
        return this.sizeBytes;
    }

    /**
     * Human-readable name for this source; may be user or system generated.
     * 
     */
    @Import(name="userName", required=true)
      private final String userName;

    public String getUserName() {
        return this.userName;
    }

    public StageSourceResponse(
        String name,
        String originalTransformOrCollection,
        String sizeBytes,
        String userName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.originalTransformOrCollection = Objects.requireNonNull(originalTransformOrCollection, "expected parameter 'originalTransformOrCollection' to be non-null");
        this.sizeBytes = Objects.requireNonNull(sizeBytes, "expected parameter 'sizeBytes' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private StageSourceResponse() {
        this.name = null;
        this.originalTransformOrCollection = null;
        this.sizeBytes = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StageSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String originalTransformOrCollection;
        private String sizeBytes;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(StageSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransformOrCollection = defaults.originalTransformOrCollection;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.userName = defaults.userName;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder originalTransformOrCollection(String originalTransformOrCollection) {
            this.originalTransformOrCollection = Objects.requireNonNull(originalTransformOrCollection);
            return this;
        }
        public Builder sizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public StageSourceResponse build() {
            return new StageSourceResponse(name, originalTransformOrCollection, sizeBytes, userName);
        }
    }
}
