// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An AAAA record.
 * 
 */
public final class AaaaRecordResponse extends com.pulumi.resources.InvokeArgs {

    public static final AaaaRecordResponse Empty = new AaaaRecordResponse();

    /**
     * The IPv6 address of this AAAA record.
     * 
     */
    @Import(name="ipv6Address")
    private @Nullable String ipv6Address;

    /**
     * @return The IPv6 address of this AAAA record.
     * 
     */
    public Optional<String> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    private AaaaRecordResponse() {}

    private AaaaRecordResponse(AaaaRecordResponse $) {
        this.ipv6Address = $.ipv6Address;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AaaaRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AaaaRecordResponse $;

        public Builder() {
            $ = new AaaaRecordResponse();
        }

        public Builder(AaaaRecordResponse defaults) {
            $ = new AaaaRecordResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv6Address The IPv6 address of this AAAA record.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(@Nullable String ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        public AaaaRecordResponse build() {
            return $;
        }
    }

}
