// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * A vertex represents a 2D point in the image. NOTE: the vertex coordinates are in the same scale as the original image.
 * 
 */
public final class VertexResponse extends io.pulumi.resources.InvokeArgs {

    public static final VertexResponse Empty = new VertexResponse();

    /**
     * X coordinate.
     * 
     */
    @Import(name="x", required=true)
      private final Integer x;

    public Integer getX() {
        return this.x;
    }

    /**
     * Y coordinate.
     * 
     */
    @Import(name="y", required=true)
      private final Integer y;

    public Integer getY() {
        return this.y;
    }

    public VertexResponse(
        Integer x,
        Integer y) {
        this.x = Objects.requireNonNull(x, "expected parameter 'x' to be non-null");
        this.y = Objects.requireNonNull(y, "expected parameter 'y' to be non-null");
    }

    private VertexResponse() {
        this.x = null;
        this.y = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VertexResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer x;
        private Integer y;

        public Builder() {
    	      // Empty
        }

        public Builder(VertexResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder x(Integer x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }
        public Builder y(Integer y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }        public VertexResponse build() {
            return new VertexResponse(x, y);
        }
    }
}
