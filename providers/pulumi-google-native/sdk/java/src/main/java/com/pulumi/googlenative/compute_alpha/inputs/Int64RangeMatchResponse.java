// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * HttpRouteRuleMatch criteria for field values that must stay within the specified integer range.
 * 
 */
public final class Int64RangeMatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final Int64RangeMatchResponse Empty = new Int64RangeMatchResponse();

    /**
     * The end of the range (exclusive) in signed long integer format.
     * 
     */
    @Import(name="rangeEnd", required=true)
    private String rangeEnd;

    /**
     * @return The end of the range (exclusive) in signed long integer format.
     * 
     */
    public String rangeEnd() {
        return this.rangeEnd;
    }

    /**
     * The start of the range (inclusive) in signed long integer format.
     * 
     */
    @Import(name="rangeStart", required=true)
    private String rangeStart;

    /**
     * @return The start of the range (inclusive) in signed long integer format.
     * 
     */
    public String rangeStart() {
        return this.rangeStart;
    }

    private Int64RangeMatchResponse() {}

    private Int64RangeMatchResponse(Int64RangeMatchResponse $) {
        this.rangeEnd = $.rangeEnd;
        this.rangeStart = $.rangeStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Int64RangeMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Int64RangeMatchResponse $;

        public Builder() {
            $ = new Int64RangeMatchResponse();
        }

        public Builder(Int64RangeMatchResponse defaults) {
            $ = new Int64RangeMatchResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param rangeEnd The end of the range (exclusive) in signed long integer format.
         * 
         * @return builder
         * 
         */
        public Builder rangeEnd(String rangeEnd) {
            $.rangeEnd = rangeEnd;
            return this;
        }

        /**
         * @param rangeStart The start of the range (inclusive) in signed long integer format.
         * 
         * @return builder
         * 
         */
        public Builder rangeStart(String rangeStart) {
            $.rangeStart = rangeStart;
            return this;
        }

        public Int64RangeMatchResponse build() {
            $.rangeEnd = Objects.requireNonNull($.rangeEnd, "expected parameter 'rangeEnd' to be non-null");
            $.rangeStart = Objects.requireNonNull($.rangeStart, "expected parameter 'rangeStart' to be non-null");
            return $;
        }
    }

}
