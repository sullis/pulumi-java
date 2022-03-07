// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NsRecordResponse {
    /**
     * The name server name for this NS record.
     * 
     */
    private final @Nullable String nsdname;

    @OutputCustomType.Constructor({"nsdname"})
    private NsRecordResponse(@Nullable String nsdname) {
        this.nsdname = nsdname;
    }

    /**
     * The name server name for this NS record.
     * 
    */
    public Optional<String> getNsdname() {
        return Optional.ofNullable(this.nsdname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NsRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nsdname;

        public Builder() {
    	      // Empty
        }

        public Builder(NsRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nsdname = defaults.nsdname;
        }

        public Builder setNsdname(@Nullable String nsdname) {
            this.nsdname = nsdname;
            return this;
        }
        public NsRecordResponse build() {
            return new NsRecordResponse(nsdname);
        }
    }
}