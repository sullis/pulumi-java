// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Each KPI must contain a &#39;type&#39; and &#39;enabled&#39; key.
 * 
 */
public final class KpiPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KpiPropertiesResponse Empty = new KpiPropertiesResponse();

    /**
     * show the KPI in the UI?
     * 
     */
    @Import(name="enabled")
    private @Nullable Boolean enabled;

    /**
     * @return show the KPI in the UI?
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * ID of resource related to metric (budget).
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return ID of resource related to metric (budget).
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * KPI type (Forecast, Budget).
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return KPI type (Forecast, Budget).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private KpiPropertiesResponse() {}

    private KpiPropertiesResponse(KpiPropertiesResponse $) {
        this.enabled = $.enabled;
        this.id = $.id;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KpiPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KpiPropertiesResponse $;

        public Builder() {
            $ = new KpiPropertiesResponse();
        }

        public Builder(KpiPropertiesResponse defaults) {
            $ = new KpiPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled show the KPI in the UI?
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param id ID of resource related to metric (budget).
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param type KPI type (Forecast, Budget).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public KpiPropertiesResponse build() {
            return $;
        }
    }

}
