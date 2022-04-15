// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCipherTextArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCipherTextArgs Empty = new GetCipherTextArgs();

    /**
     * An optional mapping that makes up the encryption context.
     * 
     */
    @Import(name="context")
      private final @Nullable Map<String,String> context;

    public Map<String,String> context() {
        return this.context == null ? Map.of() : this.context;
    }

    /**
     * Globally unique key ID for the customer master key.
     * 
     */
    @Import(name="keyId", required=true)
      private final String keyId;

    public String keyId() {
        return this.keyId;
    }

    /**
     * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
     * 
     */
    @Import(name="plaintext", required=true)
      private final String plaintext;

    public String plaintext() {
        return this.plaintext;
    }

    public GetCipherTextArgs(
        @Nullable Map<String,String> context,
        String keyId,
        String plaintext) {
        this.context = context;
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.plaintext = Objects.requireNonNull(plaintext, "expected parameter 'plaintext' to be non-null");
    }

    private GetCipherTextArgs() {
        this.context = Map.of();
        this.keyId = null;
        this.plaintext = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCipherTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> context;
        private String keyId;
        private String plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCipherTextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.keyId = defaults.keyId;
    	      this.plaintext = defaults.plaintext;
        }

        public Builder context(@Nullable Map<String,String> context) {
            this.context = context;
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder plaintext(String plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }        public GetCipherTextArgs build() {
            return new GetCipherTextArgs(context, keyId, plaintext);
        }
    }
}
