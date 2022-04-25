// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Static delivery attribute mapping details.
 * 
 */
public final class StaticDeliveryAttributeMappingResponse extends com.pulumi.resources.InvokeArgs {

    public static final StaticDeliveryAttributeMappingResponse Empty = new StaticDeliveryAttributeMappingResponse();

    /**
     * Boolean flag to tell if the attribute contains sensitive information .
     * 
     */
    @Import(name="isSecret")
    private @Nullable Boolean isSecret;

    /**
     * @return Boolean flag to tell if the attribute contains sensitive information .
     * 
     */
    public Optional<Boolean> isSecret() {
        return Optional.ofNullable(this.isSecret);
    }

    /**
     * Name of the delivery attribute or header.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the delivery attribute or header.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of the delivery attribute or header name.
     * Expected value is &#39;Static&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Type of the delivery attribute or header name.
     * Expected value is &#39;Static&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Value of the delivery attribute.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    /**
     * @return Value of the delivery attribute.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private StaticDeliveryAttributeMappingResponse() {}

    private StaticDeliveryAttributeMappingResponse(StaticDeliveryAttributeMappingResponse $) {
        this.isSecret = $.isSecret;
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticDeliveryAttributeMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticDeliveryAttributeMappingResponse $;

        public Builder() {
            $ = new StaticDeliveryAttributeMappingResponse();
        }

        public Builder(StaticDeliveryAttributeMappingResponse defaults) {
            $ = new StaticDeliveryAttributeMappingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param isSecret Boolean flag to tell if the attribute contains sensitive information .
         * 
         * @return builder
         * 
         */
        public Builder isSecret(@Nullable Boolean isSecret) {
            $.isSecret = isSecret;
            return this;
        }

        /**
         * @param name Name of the delivery attribute or header.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param type Type of the delivery attribute or header name.
         * Expected value is &#39;Static&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param value Value of the delivery attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public StaticDeliveryAttributeMappingResponse build() {
            $.isSecret = Codegen.booleanProp("isSecret").arg($.isSecret).def(false).getNullable();
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
