// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs();

    /**
     * The end of the range (exclusive).
     * 
     */
    @InputImport(name="rangeEnd", required=true)
    private final Input<Integer> rangeEnd;

    public Input<Integer> getRangeEnd() {
        return this.rangeEnd;
    }

    /**
     * The start of the range (inclusive).
     * 
     */
    @InputImport(name="rangeStart", required=true)
    private final Input<Integer> rangeStart;

    public Input<Integer> getRangeStart() {
        return this.rangeStart;
    }

    public RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs(
        Input<Integer> rangeEnd,
        Input<Integer> rangeStart) {
        this.rangeEnd = Objects.requireNonNull(rangeEnd, "expected parameter 'rangeEnd' to be non-null");
        this.rangeStart = Objects.requireNonNull(rangeStart, "expected parameter 'rangeStart' to be non-null");
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs() {
        this.rangeEnd = Input.empty();
        this.rangeStart = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> rangeEnd;
        private Input<Integer> rangeStart;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rangeEnd = defaults.rangeEnd;
    	      this.rangeStart = defaults.rangeStart;
        }

        public Builder setRangeEnd(Input<Integer> rangeEnd) {
            this.rangeEnd = Objects.requireNonNull(rangeEnd);
            return this;
        }

        public Builder setRangeEnd(Integer rangeEnd) {
            this.rangeEnd = Input.of(Objects.requireNonNull(rangeEnd));
            return this;
        }

        public Builder setRangeStart(Input<Integer> rangeStart) {
            this.rangeStart = Objects.requireNonNull(rangeStart);
            return this;
        }

        public Builder setRangeStart(Integer rangeStart) {
            this.rangeStart = Input.of(Objects.requireNonNull(rangeStart));
            return this;
        }

        public RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs(rangeEnd, rangeStart);
        }
    }
}
