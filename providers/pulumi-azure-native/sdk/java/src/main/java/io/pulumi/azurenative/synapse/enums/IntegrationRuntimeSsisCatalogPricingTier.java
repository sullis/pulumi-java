// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    @EnumType
    public enum IntegrationRuntimeSsisCatalogPricingTier {
        Basic("Basic"),
        Standard("Standard"),
        Premium("Premium"),
        PremiumRS("PremiumRS");

        private final String value;

        IntegrationRuntimeSsisCatalogPricingTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IntegrationRuntimeSsisCatalogPricingTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
