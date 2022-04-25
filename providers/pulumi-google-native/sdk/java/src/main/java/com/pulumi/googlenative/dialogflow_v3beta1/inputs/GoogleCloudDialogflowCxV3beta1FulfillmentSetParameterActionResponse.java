// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * Setting a parameter value.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse Empty = new GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse();

    /**
     * Display name of the parameter.
     * 
     */
    @Import(name="parameter", required=true)
    private String parameter;

    /**
     * @return Display name of the parameter.
     * 
     */
    public String parameter() {
        return this.parameter;
    }

    /**
     * The new value of the parameter. A null value clears the parameter.
     * 
     */
    @Import(name="value", required=true)
    private Object value;

    /**
     * @return The new value of the parameter. A null value clears the parameter.
     * 
     */
    public Object value() {
        return this.value;
    }

    private GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse() {}

    private GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse(GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse $) {
        this.parameter = $.parameter;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameter Display name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder parameter(String parameter) {
            $.parameter = parameter;
            return this;
        }

        /**
         * @param value The new value of the parameter. A null value clears the parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(Object value) {
            $.value = value;
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse build() {
            $.parameter = Objects.requireNonNull($.parameter, "expected parameter 'parameter' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
