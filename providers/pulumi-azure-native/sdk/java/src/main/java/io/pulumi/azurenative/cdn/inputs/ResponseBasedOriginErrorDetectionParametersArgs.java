// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.ResponseBasedDetectedErrorTypes;
import io.pulumi.azurenative.cdn.inputs.HttpErrorRangeParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The JSON object that contains the properties to determine origin health using real requests/responses.
 * 
 */
public final class ResponseBasedOriginErrorDetectionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseBasedOriginErrorDetectionParametersArgs Empty = new ResponseBasedOriginErrorDetectionParametersArgs();

    /**
     * The list of Http status code ranges that are considered as server errors for origin and it is marked as unhealthy.
     * 
     */
    @InputImport(name="httpErrorRanges")
    private final @Nullable Input<List<HttpErrorRangeParametersArgs>> httpErrorRanges;

    public Input<List<HttpErrorRangeParametersArgs>> getHttpErrorRanges() {
        return this.httpErrorRanges == null ? Input.empty() : this.httpErrorRanges;
    }

    /**
     * Type of response errors for real user requests for which origin will be deemed unhealthy
     * 
     */
    @InputImport(name="responseBasedDetectedErrorTypes")
    private final @Nullable Input<ResponseBasedDetectedErrorTypes> responseBasedDetectedErrorTypes;

    public Input<ResponseBasedDetectedErrorTypes> getResponseBasedDetectedErrorTypes() {
        return this.responseBasedDetectedErrorTypes == null ? Input.empty() : this.responseBasedDetectedErrorTypes;
    }

    /**
     * The percentage of failed requests in the sample where failover should trigger.
     * 
     */
    @InputImport(name="responseBasedFailoverThresholdPercentage")
    private final @Nullable Input<Integer> responseBasedFailoverThresholdPercentage;

    public Input<Integer> getResponseBasedFailoverThresholdPercentage() {
        return this.responseBasedFailoverThresholdPercentage == null ? Input.empty() : this.responseBasedFailoverThresholdPercentage;
    }

    public ResponseBasedOriginErrorDetectionParametersArgs(
        @Nullable Input<List<HttpErrorRangeParametersArgs>> httpErrorRanges,
        @Nullable Input<ResponseBasedDetectedErrorTypes> responseBasedDetectedErrorTypes,
        @Nullable Input<Integer> responseBasedFailoverThresholdPercentage) {
        this.httpErrorRanges = httpErrorRanges;
        this.responseBasedDetectedErrorTypes = responseBasedDetectedErrorTypes;
        this.responseBasedFailoverThresholdPercentage = responseBasedFailoverThresholdPercentage;
    }

    private ResponseBasedOriginErrorDetectionParametersArgs() {
        this.httpErrorRanges = Input.empty();
        this.responseBasedDetectedErrorTypes = Input.empty();
        this.responseBasedFailoverThresholdPercentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseBasedOriginErrorDetectionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<HttpErrorRangeParametersArgs>> httpErrorRanges;
        private @Nullable Input<ResponseBasedDetectedErrorTypes> responseBasedDetectedErrorTypes;
        private @Nullable Input<Integer> responseBasedFailoverThresholdPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseBasedOriginErrorDetectionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpErrorRanges = defaults.httpErrorRanges;
    	      this.responseBasedDetectedErrorTypes = defaults.responseBasedDetectedErrorTypes;
    	      this.responseBasedFailoverThresholdPercentage = defaults.responseBasedFailoverThresholdPercentage;
        }

        public Builder setHttpErrorRanges(@Nullable Input<List<HttpErrorRangeParametersArgs>> httpErrorRanges) {
            this.httpErrorRanges = httpErrorRanges;
            return this;
        }

        public Builder setHttpErrorRanges(@Nullable List<HttpErrorRangeParametersArgs> httpErrorRanges) {
            this.httpErrorRanges = Input.ofNullable(httpErrorRanges);
            return this;
        }

        public Builder setResponseBasedDetectedErrorTypes(@Nullable Input<ResponseBasedDetectedErrorTypes> responseBasedDetectedErrorTypes) {
            this.responseBasedDetectedErrorTypes = responseBasedDetectedErrorTypes;
            return this;
        }

        public Builder setResponseBasedDetectedErrorTypes(@Nullable ResponseBasedDetectedErrorTypes responseBasedDetectedErrorTypes) {
            this.responseBasedDetectedErrorTypes = Input.ofNullable(responseBasedDetectedErrorTypes);
            return this;
        }

        public Builder setResponseBasedFailoverThresholdPercentage(@Nullable Input<Integer> responseBasedFailoverThresholdPercentage) {
            this.responseBasedFailoverThresholdPercentage = responseBasedFailoverThresholdPercentage;
            return this;
        }

        public Builder setResponseBasedFailoverThresholdPercentage(@Nullable Integer responseBasedFailoverThresholdPercentage) {
            this.responseBasedFailoverThresholdPercentage = Input.ofNullable(responseBasedFailoverThresholdPercentage);
            return this;
        }

        public ResponseBasedOriginErrorDetectionParametersArgs build() {
            return new ResponseBasedOriginErrorDetectionParametersArgs(httpErrorRanges, responseBasedDetectedErrorTypes, responseBasedFailoverThresholdPercentage);
        }
    }
}
