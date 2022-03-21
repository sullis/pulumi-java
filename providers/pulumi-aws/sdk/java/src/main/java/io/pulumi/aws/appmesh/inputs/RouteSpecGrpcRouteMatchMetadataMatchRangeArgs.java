// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class RouteSpecGrpcRouteMatchMetadataMatchRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteMatchMetadataMatchRangeArgs Empty = new RouteSpecGrpcRouteMatchMetadataMatchRangeArgs();

    /**
     * The end of the range.
     * 
     */
    @Import(name="end", required=true)
      private final Output<Integer> end;

    public Output<Integer> getEnd() {
        return this.end;
    }

    /**
     * The start of the range.
     * 
     */
    @Import(name="start", required=true)
      private final Output<Integer> start;

    public Output<Integer> getStart() {
        return this.start;
    }

    public RouteSpecGrpcRouteMatchMetadataMatchRangeArgs(
        Output<Integer> end,
        Output<Integer> start) {
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
    }

    private RouteSpecGrpcRouteMatchMetadataMatchRangeArgs() {
        this.end = Output.empty();
        this.start = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteMatchMetadataMatchRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> end;
        private Output<Integer> start;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteMatchMetadataMatchRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder end(Output<Integer> end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        public Builder end(Integer end) {
            this.end = Output.of(Objects.requireNonNull(end));
            return this;
        }
        public Builder start(Output<Integer> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public Builder start(Integer start) {
            this.start = Output.of(Objects.requireNonNull(start));
            return this;
        }        public RouteSpecGrpcRouteMatchMetadataMatchRangeArgs build() {
            return new RouteSpecGrpcRouteMatchMetadataMatchRangeArgs(end, start);
        }
    }
}
