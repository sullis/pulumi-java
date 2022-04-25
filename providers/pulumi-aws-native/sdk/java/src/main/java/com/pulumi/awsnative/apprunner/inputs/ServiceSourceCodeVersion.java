// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.awsnative.apprunner.enums.ServiceSourceCodeVersionType;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Source Code Version
 * 
 */
public final class ServiceSourceCodeVersion extends com.pulumi.resources.InvokeArgs {

    public static final ServiceSourceCodeVersion Empty = new ServiceSourceCodeVersion();

    /**
     * Source Code Version Type
     * 
     */
    @Import(name="type", required=true)
    private ServiceSourceCodeVersionType type;

    /**
     * @return Source Code Version Type
     * 
     */
    public ServiceSourceCodeVersionType type() {
        return this.type;
    }

    /**
     * Source Code Version Value
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return Source Code Version Value
     * 
     */
    public String value() {
        return this.value;
    }

    private ServiceSourceCodeVersion() {}

    private ServiceSourceCodeVersion(ServiceSourceCodeVersion $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSourceCodeVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSourceCodeVersion $;

        public Builder() {
            $ = new ServiceSourceCodeVersion();
        }

        public Builder(ServiceSourceCodeVersion defaults) {
            $ = new ServiceSourceCodeVersion(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Source Code Version Type
         * 
         * @return builder
         * 
         */
        public Builder type(ServiceSourceCodeVersionType type) {
            $.type = type;
            return this;
        }

        /**
         * @param value Source Code Version Value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public ServiceSourceCodeVersion build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
