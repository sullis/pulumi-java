// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListIntegrationRuntimeAuthKeyResult {
    /**
     * The primary integration runtime authentication key.
     * 
     */
    private final @Nullable String authKey1;
    /**
     * The secondary integration runtime authentication key.
     * 
     */
    private final @Nullable String authKey2;

    @CustomType.Constructor
    private ListIntegrationRuntimeAuthKeyResult(
        @CustomType.Parameter("authKey1") @Nullable String authKey1,
        @CustomType.Parameter("authKey2") @Nullable String authKey2) {
        this.authKey1 = authKey1;
        this.authKey2 = authKey2;
    }

    /**
     * The primary integration runtime authentication key.
     * 
    */
    public Optional<String> getAuthKey1() {
        return Optional.ofNullable(this.authKey1);
    }
    /**
     * The secondary integration runtime authentication key.
     * 
    */
    public Optional<String> getAuthKey2() {
        return Optional.ofNullable(this.authKey2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIntegrationRuntimeAuthKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authKey1;
        private @Nullable String authKey2;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIntegrationRuntimeAuthKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authKey1 = defaults.authKey1;
    	      this.authKey2 = defaults.authKey2;
        }

        public Builder authKey1(@Nullable String authKey1) {
            this.authKey1 = authKey1;
            return this;
        }
        public Builder authKey2(@Nullable String authKey2) {
            this.authKey2 = authKey2;
            return this;
        }        public ListIntegrationRuntimeAuthKeyResult build() {
            return new ListIntegrationRuntimeAuthKeyResult(authKey1, authKey2);
        }
    }
}
