// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The JSON object that represents the range for http status codes
 * 
 */
public final class HttpErrorRangeParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpErrorRangeParametersArgs Empty = new HttpErrorRangeParametersArgs();

    /**
     * The inclusive start of the http status code range.
     * 
     */
    @Import(name="begin")
    private @Nullable Output<Integer> begin;

    /**
     * @return The inclusive start of the http status code range.
     * 
     */
    public Optional<Output<Integer>> begin() {
        return Optional.ofNullable(this.begin);
    }

    /**
     * The inclusive end of the http status code range.
     * 
     */
    @Import(name="end")
    private @Nullable Output<Integer> end;

    /**
     * @return The inclusive end of the http status code range.
     * 
     */
    public Optional<Output<Integer>> end() {
        return Optional.ofNullable(this.end);
    }

    private HttpErrorRangeParametersArgs() {}

    private HttpErrorRangeParametersArgs(HttpErrorRangeParametersArgs $) {
        this.begin = $.begin;
        this.end = $.end;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpErrorRangeParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpErrorRangeParametersArgs $;

        public Builder() {
            $ = new HttpErrorRangeParametersArgs();
        }

        public Builder(HttpErrorRangeParametersArgs defaults) {
            $ = new HttpErrorRangeParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param begin The inclusive start of the http status code range.
         * 
         * @return builder
         * 
         */
        public Builder begin(@Nullable Output<Integer> begin) {
            $.begin = begin;
            return this;
        }

        /**
         * @param begin The inclusive start of the http status code range.
         * 
         * @return builder
         * 
         */
        public Builder begin(Integer begin) {
            return begin(Output.of(begin));
        }

        /**
         * @param end The inclusive end of the http status code range.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<Integer> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end The inclusive end of the http status code range.
         * 
         * @return builder
         * 
         */
        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        public HttpErrorRangeParametersArgs build() {
            return $;
        }
    }

}
