
package org.apereo.cas;

import org.apereo.cas.authentication.PasswordlessTokenAuthenticationHandlerTests;
import org.apereo.cas.impl.account.GroovyPasswordlessUserAccountStoreTests;
import org.apereo.cas.impl.account.RestfulPasswordlessUserAccountStoreTests;
import org.apereo.cas.impl.token.RestfulPasswordlessTokenRepositoryTests;
import org.apereo.cas.web.flow.DisplayBeforePasswordlessAuthenticationActionTests;
import org.apereo.cas.web.flow.PasswordlessAuthenticationWebflowConfigurerTests;
import org.apereo.cas.web.flow.PrepareForPasswordlessAuthenticationActionTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0-RC3
 */
@SelectClasses({
    PasswordlessAuthenticationWebflowConfigurerTests.class,
    RestfulPasswordlessTokenRepositoryTests.class,
    RestfulPasswordlessUserAccountStoreTests.class,
    GroovyPasswordlessUserAccountStoreTests.class,
    DisplayBeforePasswordlessAuthenticationActionTests.class,
    PrepareForPasswordlessAuthenticationActionTests.class,
    PasswordlessTokenAuthenticationHandlerTests.class
})
@RunWith(JUnitPlatform.class)
public class AllTestsSuite {
}
