// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A PTR record.
 * 
 */
public final class PtrRecordResponse extends com.pulumi.resources.InvokeArgs {

    public static final PtrRecordResponse Empty = new PtrRecordResponse();

    /**
     * The PTR target domain name for this PTR record.
     * 
     */
    @Import(name="ptrdname")
    private @Nullable String ptrdname;

    /**
     * @return The PTR target domain name for this PTR record.
     * 
     */
    public Optional<String> ptrdname() {
        return Optional.ofNullable(this.ptrdname);
    }

    private PtrRecordResponse() {}

    private PtrRecordResponse(PtrRecordResponse $) {
        this.ptrdname = $.ptrdname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PtrRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PtrRecordResponse $;

        public Builder() {
            $ = new PtrRecordResponse();
        }

        public Builder(PtrRecordResponse defaults) {
            $ = new PtrRecordResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ptrdname The PTR target domain name for this PTR record.
         * 
         * @return builder
         * 
         */
        public Builder ptrdname(@Nullable String ptrdname) {
            $.ptrdname = ptrdname;
            return this;
        }

        public PtrRecordResponse build() {
            return $;
        }
    }

}
