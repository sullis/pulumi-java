// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceServiceAccount {
    /**
     * @return The service account e-mail address.
     * 
     */
    private final String email;
    /**
     * @return A list of service scopes.
     * 
     */
    private final List<String> scopes;

    @CustomType.Constructor
    private GetInstanceServiceAccount(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("scopes") List<String> scopes) {
        this.email = email;
        this.scopes = scopes;
    }

    /**
     * @return The service account e-mail address.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return A list of service scopes.
     * 
     */
    public List<String> scopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceServiceAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }        public GetInstanceServiceAccount build() {
            return new GetInstanceServiceAccount(email, scopes);
        }
    }
}
